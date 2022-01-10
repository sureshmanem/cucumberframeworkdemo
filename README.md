
# Cucumber Framework


Overview

*Behaviour driven development is a technique for building software in which the product owner, programmer and tester collaborate on system behaviour.* 

*It encourages shared understanding and collaboration by writing simple specifications which is easy to read and understand.*

Workflow

*Cucumber is a tool to achieve behaviour driven development it offers a need to write test that anybody can understand, regardless of their technical knowledge.*

*Cucumber is a tool to achieve behaviour driven development.*

*It offers a need to write test that anybody can understand, regardless of their technical knowledge.*

*It is used for writing customer acceptance test which uses Gherkin language.*

- Key benefits and drawbacks
    
    Pros
    
    *Cucumber is an open source tool for implementing behaviour driven development.* 
    
    *Cucumber makes it possible to describe the behaviour of applications in plain English.* 
    
    *Requirements are directly converted into test cases.* 
    
    *Multiple scenarios can run using steps.*
    
    **Cons**
    
    *Lacking of tool for managing features and scenarios effectively.*
    
    *Configuring a appium is a long process so integrating cucumber with appium is very tedious.*
    
1. Write Declarative features

    *Style of writing a feature file is concise and to the point, contains only relevant information about the story.
    The declarative style is more readable as it contains less steps in the scenario. The reader can easily understand the scope of the test and quickly identify if any key elements are missing.*
2. Insert a narrative
    
    *Narratives describe in about one sentence what a feature does. Typical narratives continue benefit for the user, a role that needs the feature and the feature itself. Narratives are important to envision why you are implementing a feature in the first place. They also gave a short overview of the feature so others get a rough understanding what it is about without reading the scenarios.*
    
3. Reuse Step Definitions
    
    *In cucumber you can reuse steps in other steps. This comes in handy when you step extends another step’s behaviour or defines a superior behaviour that consists of multiple steps. You should try to reuse the steps as often as possible. This will improve the maintainability of your app: if you need a change a certain behaviour, you just need to change a single step definition.* 
    
4. Use Rake Tasks to Run Features
    
    *This provides a consistent environment for running features: this way each run uses the same set of options and parameters. This goes a long way towards maintaining deterministic results. Another benefit is that this makes for easy integration with continuous integration tools. There is a single point of entry into spec run, with all options or parameters encapsulated.*
    
5. Stop once you’ve an expectation
    
    *No more user actions (click_link and Enter) after a Then.
    Only asset on Then steps
    Split complicated workflows in different scenarios (I.e Account creation + quote creation + payment completion)*
    
6. Avoid using conjunctive steps
    
    *Each step should do one thing. You hold not generally have step patterns containing “and” for example: 
    Give A and B
    should be split into two steps:
    Give A
    And B*
    
7. Parsing time in your step definitions
    
    *Use a Library (Such as Chronic) for Parsing Time in Your Step Definitions. this allows you to use time in scenarios in a natural way. This is especially useful for relative times.
    Background: Given a user signs up for a 30 day discount.
    Scenario: access before expiry
    When they login in 29 days
    Then they will be let in
    Scenario: access after expiry
    When they login in 31 days
    then they will be asked to renew*
    
8. Use backgrounds wisely
    
    *If you use the same steps what is the beginning of all scenarios of a feature, put them into the features background. Background steps are run before each scenario. But take care that you don’t put too many steps in there as your scenario maybe come hard to understand.*
    
9. Organise Your Features and Scenarios
    
    *Organize your features and scenarios with the same thought you give to Organize your code.
    
    One useful way to Organize things is by how fast they run. Use 2-3 levels of granularity for this:
    a. Fast: scenarios that run very fast. Ex. Under 1/10 of a second
    b. Slow: scenarios that are slower but not painfully slow, maybe under one second each.
    c. Glacial: scenarios that take a really long time to run
    
    You can do this separation several different ways (and even some combination):
    a. Put them in separate features
    b. Put them in separate subdirectories
    c. Tag them*
