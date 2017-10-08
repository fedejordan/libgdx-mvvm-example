# libgdx-mvvm-example
Basic boilerplate to create a game with LibGDX with a MVVM architecture

I saw that a common problem in making games from scratch is to choose the architecture of the project. 
In medium/big projects this makes huge classes with a lot of responsabilities and when the dev wants to add something new it's difficult to understand where and how.

I think that this can be an approach to separate game presentation (Screens), game logic (ViewModels) and game navigation (Routers), generally mixed and difficult to test in various projects.
### Main classes:

- Game: This is the main class of the project. Its responsability is to init resources, common dependencies, and load the first screen with the corresponding builder.

#### For each flow:

- Router: It has to present the requested flow and navigate to others.

- Builder: It has to build all the things that a new flow needs. A builder uses a Dependency object to know what a flow needs to work.

- ViewModel: Contains logic about which information show to the user and what to do with the user actions. 

- Screen: Presents the information to the user. Communicates with a ViewModel to know what to do with the user events.

- Dependency: Contains the dependencies needed by the builders, to construct new flows.


### TODO:
- Add unit tests (jUnit)
- Do script to autogenerate boilerplate (Router, Builder, Screen, ViewModel and listeners) for a new flow
- More logic to show how to do more sophisticated things :)

Fell free to post any issues, or submit any pull request with suggestions. 
If you want to contact me, send an email to fedejordan99@gmail.com
Thanks for your support!
