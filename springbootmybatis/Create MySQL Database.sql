drop TABLE TBL_STUDENT;

CREATE TABLE TBL_STUDENT (
                             IDs INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                             NAMEs VARCHAR(100) NOT NULL,
                             BRANCH VARCHAR(255) NOT NULL,
                             PERCENTAGE INT NOT NULL,
                             PHONE BIGINT NOT NULL,
                             EMAIL VARCHAR(255) NOT NULL
);


Insert into TBL_STUDENT(NAMEs,BRANCH ,PERCENTAGE ,PHONE, EMAIL) values
('Binh 001','HCMUT1',99,01234567890,'1@abcd'),
('Binh 002','HCMUT2',98,01234567891,'2@abcd'),
('Binh 003','HCMUT3',97,01234567892,'3@abcd');

select * from TBL_STUDENT;