package clone;

import java.util.ArrayList;
import java.util.List;

public class Essay implements Cloneable{

    private String title;
    private String introduction;
    private ArrayList<String> imgs;

    public Essay(String title, String introduction, ArrayList<String> imgs) {
        this.title = title;
        this.introduction = introduction;
        this.imgs = imgs;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Essay essayClone= (Essay) super.clone();
        essayClone.imgs= (ArrayList<String>) imgs.clone();
        return essayClone;
    }

    @Override
    public String toString() {
        return "Essay{" +
                "title='" + title + '\'' +
                ", introduction='" + introduction + '\'' +
                ", imgs=" + imgs +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        String title = "原型模式";
        String introduction = "介绍一";
        ArrayList<String> imgs = new ArrayList<>();
        imgs.add("图片一");
        Essay essay = new Essay(title, introduction, imgs);
        Essay essay1= (Essay) essay.clone();
        essay1.imgs.add("嘿嘿嘿");
        System.out.println(essay.toString());
    }

}
