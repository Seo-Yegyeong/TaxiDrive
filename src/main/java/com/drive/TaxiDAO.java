package com.drive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class TaxiDAO {

    @Autowired
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    //VO variables : id, username, phonenumber, departure, arrival, grade, reserveDate, wheelchair;
    private final String DRIVE_INSERT = "insert into DRIVE (username, phonenumber, departure, arrival, grade, reserveDate, wheelchair) values (?,?,?,?,?,?,?)";
    private final String DRIVE_UPDATE = "update DRIVE set username=? phonenumber=? departure=? arrival=? grade=? reserveDate=? wheelchair=? where id=?";
    private final String DRIVE_DELETE = "delete from DRIVE where id=?";


    public int insertDRIVE(TaxiVO vo) {
        return template.update(DRIVE_INSERT, new
                Object[]{vo.getUsername(), vo.getPhonenumber(), vo.getDeparture(), vo.getArrival(), vo.getGrade(), vo.getReserveDate(), vo.isWheelchair()});
    }

    public int deleteDRIVE(int id)
    {
        return template.update(DRIVE_DELETE, new Object[]{id});
    }

    public int updateDRIVE(TaxiVO vo){
        return template.update(DRIVE_UPDATE, new Object[]{vo.getUsername(), vo.getPhonenumber(), vo.getDeparture(), vo.getArrival(), vo.getGrade(), vo.getReserveDate(), vo.isWheelchair(), vo.getId()});
    }

}
