var BPFormCreation = React.createClass({

    getInitialState: function() {
        return({config: {steps: []}});
    },

    addNewStep: function() {
        var currentStepsState = this.state.config.steps;
        var numberStep = currentStepsState.length + 1;
        var newStep = {stepName: 'step' + numberStep};
        currentStepsState.push(newStep);
        this.setState(Object.assign(this.state, {config: {steps: currentStepsState}}));
    },

    render: function() {

        var steps = this.state.config.steps.map((data) => <BPStep key={data.stepName} name={data.stepName}/>);
        return(
            <form method="post" action="/bp/create" name="bp_template">
                <label>Имя шаблона</label>: <input type="text" name="bp_name"/>
                <div onClick={this.addNewStep}>Новый шаг</div>
                <div>
                    {steps}
                </div>
                <button>Сохранить</button>
            </form>
        );
    }
});

components.register('BusinessProcessFormCreation', BPFormCreation);