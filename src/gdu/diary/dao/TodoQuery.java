package gdu.diary.dao;

public class TodoQuery {
	public final static String DELETE_TODO_BY_MEMBER;
	static {
		DELETE_TODO_BY_MEMBER = "DELETE FROM todo WHERE member_no=?";
	}
	
	public final static String INSERT_TODO;
	static {
		INSERT_TODO = "INSERT INTO todo( member_no, todo_date, todo_title, todo_content, todo_font_color, todo_add_date) VALUES(?,?,?,?,?, NOW())";
	}
	
	public final static String SELECT_TODO_LIST_BY_DATE;
	static {
		SELECT_TODO_LIST_BY_DATE = "SELECT member_no memberNo, todo_font_color TodoFontColor, todo_no todoNo, left(todo_title,10) todoTitle, DAY(todo_date) todoDate FROM todo WHERE YEAR(todo_date)=? AND MONTH(todo_date)=? AND member_no=?";
	}
}
