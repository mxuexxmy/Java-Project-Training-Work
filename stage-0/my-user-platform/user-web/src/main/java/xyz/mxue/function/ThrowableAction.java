package xyz.mxue.function;

import java.util.function.Function;
/**
 * @author mxuexxmy
 * A funcation interface for action with {@link Throwable}
 *
 * @see Function
 * @see Throwable
 */
@FunctionalInterface
public interface ThrowableAction {

    void execute() throws Throwable;

    static void execute(ThrowableAction action) throws RuntimeException {
        try {
            action.execute();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

}
