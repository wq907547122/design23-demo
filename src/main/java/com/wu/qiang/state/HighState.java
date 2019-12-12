package com.wu.qiang.state;

/**
 * 具体状态类：优秀
 * @auth wq on 2019/12/11 10:48
 **/
public class HighState extends AbstractState {
    public HighState(AbstractState state) {
        this.context = state.context;
        this.score = state.score;
        this.stateName = "优秀";
    }
    @Override
    public void checkState() {
        if(score<60)
        {
            context.setState(new LowState(this));
        }
        else if(score<90)
        {
            context.setState(new MiddleState(this));
        }
    }
}
