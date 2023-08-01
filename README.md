# Chain_Of_Responsibility
Chain of responsibility pattern belongs to the behavioral design pattern and that allows you to pass the requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.

In brief this design pattern avoid coupling sender and receiver.
Sender do not know who is the receiver and receiver do not know who is the sender. Receiver can perform their job without knowing sender and sender can perform his job without knowing reciever.
The object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not. As well as we can change the order of receivers without change the core implementation.
Read more on:
https://medium.com/@vpaipathirana/chain-of-responsibility-design-pattern-397f7e62d851
