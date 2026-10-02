# Facade Design Pattern

- Run SmartHomeDriver and look at what happens when arriveHome() and leaveHome() are called.

- Without SmartHomeFacade, what code would SmartHomeDriver need to execute when someone arrives home?

- What does SmartHomeFacade simplify for the client?

- Does the Facade prevent the client from using Light, Thermostat, or SecuritySystem directly? Why or why not?

- Add a new method to SmartHomeFacade called vacationMode(). Decide what should happen to the lights, thermostat, and security system when the homeowner leaves for vacation. Call your new method from SmartHomeDriver.