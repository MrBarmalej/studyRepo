package Lesson30;

public class HumanBuilderOfGod {
    // предполагалось как билдер(и да, с фантазией проблем нет:))
    private String skeleton;
    private String skin;
    private String inside;

    public void setSkeleton(String skeleton) {
        this.skeleton = skeleton;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setInside(String inside) {
        this.inside = inside;
    }
    public void show(){
        System.out.println("Humans consist of skeleton, skin and inside");
    }

}
interface Builder{
    void buildSkeleton();
    void buildSkin();
    void buildInside();
    HumanBuilderOfGod getResult();
}
class HumanCreating implements Builder{
    private HumanBuilderOfGod human = new HumanBuilderOfGod();

    @Override
    public void buildSkeleton() {
        human.setSkeleton("Bones");
    }

    @Override
    public void buildSkin() {
        human.setSkin("Black");
    }

    @Override
    public void buildInside() {
        human.setInside("Organs");
    }

    @Override
    public HumanBuilderOfGod getResult() {
        return human;
    }
    static class Director{
        public HumanBuilderOfGod counstruct(Builder builder){
            builder.buildSkeleton();
            builder.buildSkin();
            builder.buildInside();
            return builder.getResult();
        }
    }
    public static class Creation {
        public static void main(String[] args) {
            Builder builder = new HumanCreating();
            Director director = new Director();
            HumanBuilderOfGod human = director.counstruct(builder);
            human.show();
            System.out.println("Human created");
            }
        }
    }

