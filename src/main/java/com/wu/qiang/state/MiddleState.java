package com.wu.qiang.state;

/**
 * 具体状态类：中等
 * @auth wq on 2019/12/11 10:42
 **/
public class MiddleState extends AbstractState {

    public MiddleState(AbstractState state) {
        this.context = state.context;
        this.score = state.score;
        this.stateName = "中等";
    }

    @Override
    public void checkState() {
        if(score<60)
        {
            context.setState(new LowState(this));
        }
        else if(score>=90)
        {
            context.setState(new HighState(this));
        }
    }
}
