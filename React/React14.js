import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import React14 from './React14';
//import App from './App';
//import * as serviceWorker from './serviceWorker';

var element = React.createElement('h1', { className: 'greeting' }, 'Hello, world!');
ReactDOM.render(element, document.getElementById('root'));
//serviceWorker.unregister();
export default React14;