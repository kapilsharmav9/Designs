package RecycleViewAnimation.Model;

public class News {
    private String Title,Content,Date;
    private int UserPic;

    public News(String title, String content, String date, int userPic) {
        Title = title;
        Content = content;
        Date = date;
        UserPic = userPic;
    }


    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getUserPic() {
        return UserPic;
    }

    public void setUserPic(int userPic) {
        UserPic = userPic;
    }
}
