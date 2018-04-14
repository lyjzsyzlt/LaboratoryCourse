/**
 * @Author: YongjieLv
 * @Description: 抽象工厂接口，包含创建各种表的方法
 * @Date: Create in 19:02 2018/4/12
 * @Modified By:
 */
public interface Factory {
     User createUser();
     Department createDepartment();
     Project createProject();
}
