package change_parameter;

public class ChangeParameter {

    public static void print(String... str){
        System.out.println("你的兴趣爱好是:");
        System.out.print("\t\t\t");
        for (String s : str) {
            System.out.print(s+" ");
        }
    }

    public static void main(String[] args) {
        String[] str = {"体育","美术","电脑","旅游"};
        print(str);
    }
}
