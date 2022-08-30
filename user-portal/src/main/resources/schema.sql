Drop Table If Exists TBL_SCHEDULE;
Drop Table If Exists TBL_Days;
Drop Table If Exists usertable;

Create Table TBL_DAYS(
    dayId INT AUTO_INCREMENT,
    dayName varchar(25) NOT NULL,
    PRIMARY KEY (dayId)
);

create table TBL_SCHEDULE(
    scheduleId INT AUTO_INCREMENT,
    schedule varchar(255) NOT NULL,
    daysId int,
    PRIMARY KEY (scheduleId),
    FOREIGN KEY (daysId) REFERENCES TBL_DAYS(dayId)
)
