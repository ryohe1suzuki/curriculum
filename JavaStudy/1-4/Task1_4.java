public class Task1_4 {
    private static final String USER_NAME = "alice";
    private static final String USER_PASSWORD = "alice123";
    
    //定数(アカウント情報)
    private static final String CONST_MSG_SUCCESS = "ログイン成功です。";
    private static final String CONST_MSG_ERROR_NAME = "名前に誤りがあります。";
    private static final String CONST_MSG_ERROR_PASS = "パスワードに誤りがあります。";
    private static final String CONST_MSG_ERROR_INPUT = "入力情報に誤りがあります。";

    public static void main(String[] args) {
        

    String name = "alice" ;
    String pass = "alice123";
//if構文の場合
    if(name.equals(USER_NAME) && pass.equals(USER_PASSWORD)) {
        System.out.println(CONST_MSG_SUCCESS);
    } else if (name.equals(USER_NAME) && !(pass.equals(USER_PASSWORD))) {
        System.out.println(CONST_MSG_ERROR_PASS);
    } else if (!(name.equals(USER_NAME)) && pass.equals(USER_PASSWORD)) {
        System.out.println(CONST_MSG_ERROR_NAME);
    } else {
        System.out.println(CONST_MSG_ERROR_INPUT);
    }
}

}






