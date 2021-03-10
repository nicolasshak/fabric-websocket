const WebSocket = require('ws');
const ws = new WebSocket('ws://localhost:8080');

ws.on('open', function open() {
	ws.send('This is a message!');
});

ws.on('message', function incoming(data) {
	console.log('Message from server: ' + data);
	ws.close();
});

