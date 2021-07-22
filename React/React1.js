import React from 'react';
import ReactDOM from 'react-dom';

class Student extends React.Component{
    render() {
        
      return  <p>This is training</p>
        
    }
}
ReactDOM.render(<Student />,document.getElementById('root'));
export default Student;