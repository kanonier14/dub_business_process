var BPStep = React.createClass({
    render: function() {
        var name=this.props.name;
        return(
            <div>
                <input name={name} type="text"/>
            </div>
        );
    }
});