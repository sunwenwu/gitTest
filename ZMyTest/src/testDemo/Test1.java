package testDemo;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.Transaction;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.junit.Before;
import org.junit.Test;

import dd.dao.LsysMapper;
import dd.model.Lsys;

public class Test1 {

    
    private static SqlSessionFactoryBuilder sqlSessionFactoryBuilder;
    private static SqlSessionFactory sqlSessionFactory;
    
    @Before
    public void before(){
        String resource = "conf.xml";
        Reader reader;
        try {
            reader = Resources.getResourceAsReader(resource);
            sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }       
    }
    
    @Test
    public void test(){
        SqlSession  session = sqlSessionFactory.openSession();
        LsysMapper mapper = session.getMapper(LsysMapper.class);
        Lsys lsys = mapper.selectByPrimaryKey("1");
        
        System.out.println(lsys);
    }
    
    @Test
    public void test2() throws SQLException{
        SqlSession  session = sqlSessionFactory.openSession();
        TransactionFactory transactionFactory = new JdbcTransactionFactory(); 
        Transaction newTransaction=transactionFactory.newTransaction(session.getConnection(), false);
        LsysMapper mapper = session.getMapper(LsysMapper.class);
        
        Lsys record = new Lsys();
        record.setId("77");
        record.setGroupName("随便");
        mapper.insert(record);
        
        newTransaction.close();
    }

}


