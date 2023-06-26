/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com.edusys.dao;

import Com.edusys.entity.NhanVien;
import java.util.List;

/**
 *
 * @author DELL
 */
public class NhanVienDao extends edusysDao<NhanVien, String>{

    String insert_sql="insert into NhanVien(MaNV,MatKhau,HoTen,VaiTro) values(?,?,?,?)";
    String update_sql="update NhanVien set MatKhau=?, HoTen=?, vaiTro=? where MaNV=?";
    String delete_sql="delete NhanVien where MaNV=?";
    String selectAll_sql="select * from NhanVien";
    String selectById_sql="select * from NhanVien where MaNV=?";
    
    @Override
    public void insert(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(NhanVien entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NhanVien> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NhanVien selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void selectBySql(String sql, Object... args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
