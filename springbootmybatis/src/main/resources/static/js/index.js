
var studentTable = {
		template: '\
			<table class="table table-striped">\
			<thead class="thead-light">\
				<tr>\
					<th>Stt</th>\
					<th>Name</th>\
					<th>Branch</th>\
					<th>Percentage</th>\
					<th>Phone</th>\
					<th>Email</th>\
					<th>Action</th>\
				</tr>\
			</thead>\
			<tbody>\
				<template v-if="dataStudent.length != 0">\
					<tr v-for="(student, index) in dataStudent">\
					<td>{{index}}</td>\
					<td>{{student.name}}</td>\
					<td>{{student.branch}}</td>\
					<td>{{student.percentage}}%</td>\
					<td>{{student.phone}}</td>\
					<td>{{student.email}}</td>\
					<td>\
						<a class="edit" title="Edit" data-toggle="tooltip" data-placement="top" v-on:click="editStudent(student)"><i class="material-icons"></i></a>\
						<a class="delete" title="Delete" data-toggle="tooltip" data-placement="top" v-on:click="deleteStudent(student)"><i class="material-icons"></i></a>\
					</td>\
				</tr>\
				</template>\
				<template v-else>\
					<tr>\
						<td v-for="i in 7">chưa có dữ liệu</td>\
					</tr>\
				</template>\
			</tbody>\
		</table>\
			',
		props: ['data-student'],
		methods: {
			editStudent: function(editStudent){
				studentDataVm.isEdit = true;
				studentDataVm.studentAddModel = cloneObject(editStudent);
				$('#addModal').modal("show");
				$('#name').focus();
				
			},
			deleteStudent: function(student){
				studentDataVm.studentDeleteId = student.id;
				studentDataVm.studentDeleteName = student.name;
				$('#confirmModal').modal("show");
			}
		},
		mounted: function () {
	    	$("[data-toggle=tooltip]").tooltip();
	    	
	    },
		
};

var studentDataVm = new Vue({
	el: '#student-table-vue',
	data: {
		isEdit: false,
		studentList: [],
		studentDeleteId: null,
		studentDeleteName: null,
		studentSearchModel: {
			name: null,
			branch: null,
			phone: null,
			email: null
		},
		studentAddModel: {
			name: null,
			branch: null,
			percentage: null,
			phone: null,
			email: null
		},
		studentDeleteId: null
	},
	components: {
		'student-table': studentTable
		
	},
	methods: {
		updateData: function(){
			var self = this;
			
			axios({
        		method: 'get',
        		url: '/student/getAllStudent',	
        	})
            .then(data => {
            	self.studentList = data.data;
            })
            .catch(err => {
            	console.log("Something wrong while try to get student list");
                console.log(err);
            });
		},
		search: function(){
			var self = this;
			
			if(self.studentSearchModel.name == null 
					&& self.studentSearchModel.branch == null 
					&& self.studentSearchModel.phone == null 
					&& self.studentSearchModel.email == null) {
				alert("bạn muốn mình giúp tìm ai ♥ điền vào chỗ trống nha");
			}
			else {
				axios({
	        		method: 'post',
	        		url: '/student/getStudentByUserInput',	
	        		data: self.studentSearchModel
	        	})
	            .then(data => {
	            	self.studentList.splice(0, self.studentList.length) // clear
																		// data
	            	self.studentList = data.data;
	            	
	            	self.studentSearchModel.name = null;
	    			self.studentSearchModel.branch = null;
	    			self.studentSearchModel.phone = null;
	    			self.studentSearchModel.email = null;
	            })
	            .catch(err => {
	            	console.log("Something wrong while try to get student list");
	                console.log(err);
	            });
			}
		},
		addStudent: function(){
			var self = this;
			
			axios({
				method: 'post',
				url: 'student/addStudent',
				data: self.studentAddModel
			})
			.then(data => {
				this.updateData();
				alert(data.data);
			})
			
			$('#addModal').modal("hide");
			
		},
		editStudent: function(){
			var self = this;
			
			axios({
				method: 'post',
				url: 'student/editStudent',
				data: self.studentAddModel
			})
			.then(data => {
				this.updateData();
				alert(data.data);
			})
			
			$('#addModal').modal("hide");
		},
		deleteStudent: function(){
			var self = this;
			
			axios({
				method: 'post',
				url: 'student/deleteStudent',
				params: {
					id: self.studentDeleteId
				}
			})
			.then(data => {
				this.updateData();
				alert(data.data);
			})
			
			$('#confirmModal').modal("hide");
			
		},
		openAddModel: function(){
			var self = this;
			
			self.isEdit = false;
			self.studentAddModel.name = null;
			self.studentAddModel.branch = null;
			self.studentAddModel.percentage = null;
			self.studentAddModel.phone = null;
			self.studentAddModel.email = null;
			
			$('#addModal').modal("show");
			$('#name').focus();
		},
	},
	created: function(){
		this.updateData();
	}

});

function cloneObject(src) {
	  return Object.assign({}, src);
}

$('#email').keypress(function(e){
    if (e.keyCode==13) {
    	if (studentDataVm.isEdit == false) {
    		$('#btnAdd').click();
    	}
/*    	else {
    		$('#btnEdit').click();
    	}*/
    } 
    else {
    	
    }
    
  });


