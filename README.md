Classes
	
	Virtual Pet - Pet Instance
	Virtual Pet Shelter - Pet Shelter Instance
	Virtual Pet App - User Interface

Functions - User Functions

1. Feed the pets
2. Water the pets
3. Play with a pet
4. Adopt a pet
5. Admit a pet
6. Quit


Functions - Other 
	Initial - create default nbr of pets and initial to default status levels 
	Feed the pets - decrease hunger on ALL pets
Water the pets - decrease ALL thirst
Play with a pets - display list of pets with name and description, allow user to select A
 pet, decrease boredom of selected pet, display appropriate msg
Adopt a pet  - display list of pets with name and description, allow user to select A pet
 to adopt, remove pet from shelter, status levels out of scope (no chgs needed),
 display appropriate method  
Admit a pet  - allow user to  Add a pet to shelter, accept new name,  initialize default
 status levels, execute tick functions
Quit - User exits game
Tick Functionality - Increase hunger, increase thirst, increase boredom, execute this
 Function any time a user selects a function AND display status (do at top of 
loop). Tick should be part of Shelter Class. 

Design Specific
	Return a Collection of all pets
	Rerun a specific pet using Class VirtualPet given its name
	Create constructor to add pets
	Create constructor to initials status of pets
	

Data Elements 

	Virtual Pet 
Hunger (int) - initialize default level 	
Thirst (int) - initialize default level 
Boredom (int)  - initialize default level 
Virtual Pet Shelter 
	Virtual Pet App 


