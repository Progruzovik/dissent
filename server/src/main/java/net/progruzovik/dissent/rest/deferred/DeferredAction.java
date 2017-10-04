package net.progruzovik.dissent.rest.deferred;

import net.progruzovik.dissent.model.battle.action.Action;
import org.springframework.web.context.request.async.DeferredResult;

public final class DeferredAction extends DeferredResult<Action> {

    private final int number;

    public DeferredAction(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
