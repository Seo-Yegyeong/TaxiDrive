package com.drive;

import org.springframework.jdbc.core.JdbcTemplate;

public class TaxiDAO {
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    private final String DRIVE_INSERT = "insert into DRIVE (username, phonenumber, departure, arrival, grade, reserveDate, wheelchair) values (?,?,?,?,?,?,?)";
    private final String DRIVE_UPDATE = "update DRIVE set name=? number=? departure=? arrival=? level=? reserveDate=? wheelchair=? where id=?";
    private final String DRIVE_DELETE = "delete from DRIVE where id=?";


    public int insertDRIVE(TaxiVO vo) {
        return template.update(DRIVE_INSERT, new
                Object[]{vo.getUsername(), vo.getPhonenumber(), vo.getDeparture(), vo.getArrival(), vo.getGrade(), vo.getReserveDate(), vo.isWheelchair()});
    }

    public int deleteDRIVE(int id) {
        return 1;
    }

}
