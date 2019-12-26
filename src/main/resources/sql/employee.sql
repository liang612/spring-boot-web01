use mybatis;
DROP TABLE IF EXISTS employee;
create table employee(
	emplNum integer NOT NULL comment '员工编号',
	emplName char(11) NOT NULL comment '员工姓名',
    duty varchar(11) NOT NULL comment '职务',
    sex char(2) NOT NULL comment '性别',
    age integer NOT NULL comment '年龄',
    address varchar(30) comment '地址',
    CONSTRAINT PRIMARY KEY PK_employee(emplNum)
    );
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (19121401,'邓杰','销售经理','男',23,'湖北');
INSERT INTO employee(emplNum,emplName,duty,sex,age,address) VALUES (19121402,'李娟','大堂经理','女',33,'广州');