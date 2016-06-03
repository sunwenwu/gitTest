package dd.dao;

import dd.model.Lsys;

public interface LsysMapper {
    int deleteByPrimaryKey(String id);

    int insert(Lsys record);

    int insertSelective(Lsys record);

    Lsys selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Lsys record);

    int updateByPrimaryKey(Lsys record);
}