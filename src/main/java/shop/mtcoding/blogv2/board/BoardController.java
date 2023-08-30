package shop.mtcoding.blogv2.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    // 고객센터 글목록 화면 호출
    @GetMapping("/board")
    public String board() {

        return "/";
    }

    // ===========================================================================================
    // 게시글 글쓰기 화면 호출
    @GetMapping("/saveBoard")
    public String saveBoard() {

        return "/";
    }

    // 게시글 글쓰기 요청 응답
    @PostMapping("/board/save")
    public String save() {
        // boardService.글쓰기();
        return "redirect:/";
    }

    // ===========================================================================================

    // 게시글 글수정,삭제 화면 호출
    @GetMapping("/updateForm")
    public String updateForm() {

        return "/";
    }

    // 게시글 글수정,삭제 요청 응답
    @PostMapping("/board/update")
    public String update() {
        // boardService.글수정();
        return "redirect:/";
    }

    // ===========================================================================================

    // 게시글 댓글 화면 호출
    @GetMapping("/detailBoard")
    public String detailBoard() {

        return "/";
    }

    // 게시글 댓글작성 요청 응답
    @PostMapping("/reply/replyUpdate")
    public String replyUpdate() {
        // boardService.댓글작성();
        return "redirect:/";
    }

    // 게시글 댓글삭제 요청 응답
    @PostMapping("/reply/replyDelete")
    public String replyDelete() {
        // boardService.댓글삭제();
        return "redirect:/";
    }

    // ===========================================================================================

} // class
