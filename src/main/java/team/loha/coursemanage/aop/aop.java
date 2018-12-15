package team.loha.coursemanage.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aop {
    @Pointcut("execution(public * team.loha.coursemanage.*.*.*(..))")
    public void aopExecution(){}

    @Before("aopExecution()")
    public void comeOnAOP()
    {
        System.out.println("aop ha ha aop!");
    }
}
