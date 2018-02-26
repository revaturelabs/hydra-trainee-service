# hydra-trainee-service

The Trainee Service enables manipulation of trainee beans and handles messaging to Trainees.

Contains the following methods:
* Trainee: 
   - findAllByBatch
   - findAllDroppedByBatch
   - createTrainee
   - updateTrainee
   - deleteTrainee
   - searchTrainee
   - retrieveTraineeByEmail
* TraineeCompositionMessagingService:
   - sendSingleSimpleBatchRequest
   - sendListSimpleBatchRequest
   - sendSimpleNoteDeleteRequest
   - sendSimpleGradeDeleteRequest
   - sendSimplePanelDeleteRequest
* TraineeCompositionService
   - save(Trainee)
   - update(Trainee)
   - delete(Trainee)
   - findAll(): returns List<Trainee>
   - findAllNotDropped(): returns List<Trainee>
   - findAllByBatch(): List<Trainee>
   - findAllDroppedByBatch(): List<Trainee>
   - findAllByTrainer(): List<Trainee>
   - findOne
   - findByEmail
   - findByName
   - findBySkypeId
   - composeListOfTrainees
   - composeTrainee
* TraineeRepositoryMessagingService
   - receiveSingleSimpleTraineeRequest
   - receiveListSimpleTraineeRequest
   - receiveListTraineeRequest
* TraineeRepositoryRequestDispatcher
   - processSingleSimpleTraineeRequest
   - processListSimpleTraineeRequest
   - processListTraineeRequest