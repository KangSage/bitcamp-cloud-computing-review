package bitcamp.pms.listener;

import bitcamp.pms.controller.board.BoardAddController;
import bitcamp.pms.controller.member.*;
import bitcamp.pms.dao.BoardDao;
import bitcamp.pms.dao.MemberDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.IOException;
import java.io.InputStream;

@WebListener
public class ContextLoaderListener implements ServletContextListener {
    
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("ContextLoaderListener 실행! ");

        try {
            String resource = "bitcamp/pms/config/mybatis-config.xml";
            InputStream inputStream =
                    Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory =
                    new SqlSessionFactoryBuilder().build(inputStream);
            ServletContext sc = sce.getServletContext();

            MemberDao memberDao = new MemberDao(sqlSessionFactory);
            sc.setAttribute("/member/list",
                    new MemberListController(memberDao));
            sc.setAttribute("/member/view",
                    new MemberViewController(memberDao));
            sc.setAttribute("/member/update",
                    new MemberUpdateController(memberDao));
            sc.setAttribute("/member/delete",
                    new MemberDeleteController(memberDao));
            sc.setAttribute("/member/add",
                    new MemberAddController(memberDao));

            BoardDao boardDao = new BoardDao(sqlSessionFactory);

            sc.setAttribute("/board/list",
                    new BoardAddController(boardDao));
/*            sc.setAttribute("/board/view",
                    new BoardDao(sqlSessionFactory));
            sc.setAttribute("/board/list",
                    new BoardDao(sqlSessionFactory));
            sc.setAttribute("/board/list",
                    new BoardDao(sqlSessionFactory));*/

        } catch (IOException e) {
            e.printStackTrace();
        }


        /*BoardDao boardDao = new BoardDao(jdbcUrl, username, password);
        sc.setAttribute("boardDao", boardDao);
        
        ClassroomDao classroomDao = new ClassroomDao(jdbcUrl, username, password);
        sc.setAttribute("classroomDao", classroomDao);
        
        TeamDao teamDao = new TeamDao(jdbcUrl, username, password);
        sc.setAttribute("teamDao", teamDao);*/
    }
    
}
