/**
 * @Author: YongjieLv
 * @Description: 客户端
 * @Date: Create in 19:18 2018/4/12
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        Factory factory=SqlserverFactory.getInstance(); // 创建具体的工厂
        User user1=factory.createUser(); // 通过这个工厂去创建对应的产品
        user1.insert(); // 对产品进行操作
        user1.getUser(1);
        Department department=factory.createDepartment();
        department.insert();
        department.getDepartment(1);
        Project project=factory.createProject();
        project.insert();
        project.getProject(1);

        Factory factory2=SqlserverFactory.getInstance(); // 验证单例模式，程序中只会存在一个具体工厂实例
    }
}
