package bitcamp.pms.controller.board;

import bitcamp.pms.controller.PageController;
import bitcamp.pms.dao.BoardDao;
import bitcamp.pms.domain.Board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardAddController implements PageController {

    BoardDao boardDao;

    public BoardAddController(BoardDao boardDao) {
        this.boardDao = boardDao;
    }

    @Override
    public String service(
            HttpServletRequest request, 
            HttpServletResponse response) throws Exception {
        //new Date(System.currentTimeMillis());
        response.setContentType("text/html;charset=UTF-8");
        Board board = new Board();
        board.setTitle(request.getParameter("title"));
        board.setContent(request.getParameter("content"));
        boardDao.insert(board);
        return "list";
    }
}
