drop TABLE TBL_STUDENT;
drop SEQUENCE TBL_STUDENT_SEQ;
drop TRIGGER TBL_STUDENT_TRG;

CREATE TABLE TBL_STUDENT (
                             IDs NUMBER(10) PRIMARY KEY,
                             NAMEs VARCHAR2(100) NOT NULL,
                             BRANCH VARCHAR(255) NOT NULL,
                             PERCENTAGE NUMBER(3) NOT NULL,
                             PHONE NUMBER(11) NOT NULL,
                             EMAIL VARCHAR(255) NOT NULL
);

create sequence
    TBL_STUDENT_SEQ
    increment by 1
    start with 1;

CREATE TRIGGER TBL_STUDENT_TRG
    BEFORE INSERT ON TBL_STUDENT
    FOR EACH ROW

BEGIN
    SELECT TBL_STUDENT_SEQ.NEXTVAL
    INTO   :new.ids
    FROM   dual;
END;

Insert into TBL_STUDENT(NAMEs,BRANCH ,PERCENTAGE ,PHONE, EMAIL) values ('Binh 001','HCMUT1',99,01234567890,'1@abcd');
insert into TBL_STUDENT(NAMEs,BRANCH ,PERCENTAGE ,PHONE, EMAIL) values ('Binh 002','HCMUT2',98,01234567891,'2@abcd');
Insert into TBL_STUDENT(NAMEs,BRANCH ,PERCENTAGE ,PHONE, EMAIL) values ('Binh 003','HCMUT3',97,01234567892,'3@abcd');

select * from tbl_student;