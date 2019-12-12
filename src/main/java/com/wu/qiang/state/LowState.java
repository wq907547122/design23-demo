package com.wu.qiang.state;

/**
 * 具体状态类：不及格
 * @auth wq on 2019/12/11 10:38
 **/
public class LowState extends AbstractState {
    public LowState(ScoreContext context) {
        this.context = context;
        score = 0;
        stateName = "不及格";
    }
    public LowState(AbstractState state) {
        this.context = state.context;
        this.score = state.score;
        this.stateName = "不及格";
    }
    @Override
    public void checkState() {
        if(score>=90)
        {
            context.setState(new HighState(this));
        }
        else if(score>=60)
        {
            context.setState(new MiddleState(this));
        }
    }
}
