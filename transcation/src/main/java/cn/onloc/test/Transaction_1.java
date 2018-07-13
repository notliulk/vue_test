package cn.onloc.test;

import cn.onloc.bean.User;
import cn.onloc.service.UserService;
import cn.onloc.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.transaction.TransactionDefinition.ISOLATION_DEFAULT;

public class Transaction_1 {

    public static void main(String[] srgs) {

        ApplicationContext acx = new ClassPathXmlApplicationContext("mybatis.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) acx.getBean("jdbcTemplate");

        String sql = "update user_t set age = 50 where id = ?";

        int count = jdbcTemplate.update(sql, 1);

        int a = 1/0;

        String sql_2 = "update user_t set age = 40 where id = ?";

        int count_2 = jdbcTemplate.update(sql, 1);

        System.out.println( "count{}:" + count_2);

    }

}
