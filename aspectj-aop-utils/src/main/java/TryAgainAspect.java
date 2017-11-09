import lombok.extern.java.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by ulysse on 09/11/2017.
 */
@Log
@Aspect
@Component
public class TryAgainAspect {

    @Around("@annotation(TryAgain)")
    public Object tryAgain(ProceedingJoinPoint joinPoint) throws Throwable {

        log.info("We are in the tryagain aop");

        Object proceed = joinPoint.proceed();

        return proceed;
    }

}
