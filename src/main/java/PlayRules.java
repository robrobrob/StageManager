import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PlayRules {

    //These are for LORT Houses for plays

    final int nonPerformanceWeek14OrLessCastWorkWeekHoursPlay = 48; //51.A.2.a
    final int nonPerformanceWeek14OrLessCastWorkWeekRehearsalHoursPlay = 45; //51.A.2.a
    final int nonPerformanceWeek15OrMoreCastWorkWeekHoursPlay = 50; //51.A.2.b
    final int nonPerformanceWeek15OrMoreCastWorkWeekRehearsalHoursPlay = 47; //51.A.2.b
    final int totalWorkWeekHoursWithin7DaysOfOpeningPlay = 52; //51.A.2.c
    final int performanceRehearsalWeekHoursPlay = 50; //51.A.2.d
    final int normalWorkNotStudentDayHoursConsecutivePlay = 12; //51.A.3
    final int normalPerformancesPerWeek = 8; //51.B.1
    final int numberOfWeeksNoticeForPerformanceScheduleWithoutVote = 2; //51.B.2.a
    final int numberOfWeeksNoticeForPerformanceAdditionLessThan8 = 1; //51.B.2.b
    final int numberOfPerformancesPerDay = 2; //51.B.3
    final int numberOfPerformancesPer3DayPeriod = 5; //51.B.3
    final int numberOfHoursWorkedOnPerformanceDayIncludingHalfHour = 9; //51.B.3
    final int numberOfPerformancesLocalTours = 10; //51.B.4
    final double numberOfPerformancesLocalTourHoursPerforming = 1.5; //51.B.4
    final int numberOfPerformancesForThreeSixteenths = 9; //51.B.5
    final int numberOfPerformancesForTwoEights = 10; //51.B.5
    final int numberOfWeeksNecessaryForNoEquityApprovalOver8 = 2; //51.B.5
    final int timeBeforeWhichTwoEighthsIsNecessaryNotStudent = 12; //51.B.6
    final int timeAfterWhichTwoEightsIsNecessary = 1; //51.B.6
    final boolean equityApprovalNecessaryForNonStandardTimes = true;
    final int hoursAdditionalDueToLessThanEightPerformancesBetweenOneWeekAfterOpeningOfFinalShowOfSeasonAndOpeningPerPerformance = 4; //51.B.8
    final boolean addedRehearsalsDueToLessThanEightPerformancesBetweenOneWeekAfterOpeningOfFinalShowOfSeasonAndOpeningAffect10HourLimit = false; //51.B.8
    final boolean addedRehearsalsDueToLessThanEightPerformancesBetweenOneWeekAfterOpeningOfFinalShowOfSeasonAndOpeningUnderstudyPossible = false; //51.B.8
    final int numberOfHoursOfWorkInASevenOutOfNine = 7; //51.C.1
    final int numberOfHoursOfBreakInASevenOutOfNine = 2; //51.C.1
    final int numberOfHoursOfWorkInAEightOutOfTen = 8; //51.C.1
    final int numberOfHoursOfBreakInAEightOutOfTen = 2; //51.C.1
    final int numberOfHoursNoticeForSpanOfRehearsalDay = 12; //51.C.1
    final int numberOfStraightSixesInOneWeek = 6; //51.C.2.a
    final int numberOfAdditionalHoursOfRehearsalForStraightSixes = 2; //51.C.2.a
    final int maximumTimeConsecutiveForAdditionalRehearsalHoursForStraightSixes = 1; //51.C.2.a
    final int numberOfHoursMealBreakBetweenRehearsalAndPhotoOrCostumeCall = 1; //51.C.2.a
    final boolean is6StraightSixesEntireWeek = true;
    final boolean isStraightSixWholeWorkDayIfCombination = true; //51.C.2.b.i
    final int valueInHoursOfStraightSixWhenUsedWithSevenOutOfNineOrEightOutOfTen = 8; //51.C.2.b.ii
    final int StraightSizeMandatoryMinutesOfBreak = 40; //51.C.2.c
    final int numberOfBreaksThatMustBe20MinutesLongInStraightSix = 1; //51.C.2.c
    final int lengthInMinutesOfLongestBreakInStraightSix = 20; //51.C.2.c
    final int minutesRehearsalNormalBreakFiveMinuteBreak = 55; //51.E.2
    final int minutesLengthOfMandatoryBreakAfterFiftyFiveMinutes = 5; //51.E.2
    final int minutesRehearsalNormalBreakTenMinutesBreak = 80; //51.E.2
    final int minutesLengthOfMandatoryBreakAfterEightyMinutes = 10; //51.E.2
    final int minutesLengthOfMinimumMandatoryBreakInMinutesDuringStraightSix = 20; //51.C.2.c
    final int minutesLengthOfMandatoryBreakDuringRunAtIntermission = 10; //51.E.2
    final double OnePerformanceDayPerformanceLengthIncludingHalfHour = 3.5; //51.C.3
    final int normalOnePerformanceDayRehearsalHours = 5; //51.C.3
    final double extendedOnePerformanceDayRehearsalHours = 4.5; //51.C.3
    final double extremeOnePerformanceDayPerformanceLengthIncludingHalfHour = 4; //51.C.3
    final int extremeOnePerformanceDayRehearsalHours = 4; //51.C.3
    final int twoPerformanceDayRehearsalHoursIncludingHalfHour = 2; //51.C.4
    boolean twoHourRehearsalTwoPerformanceDay; //51.C.4
    final int repVoteDateInProductionsTwoHourRehearsalTwoPerformanceDay = 2; //51.C.4
    final int nonRepVoteDateDuringRehearsal = 1; //51.C.4
    final int numberOfHalfHourSegmentsForRehearsalExtension = 4; //51.C.4
    final double rehearsalHoursExtensionForNoTwoPerformanceDayRehearsals = .5; //51.C.4
    final double onePerformanceDayMaximumTime = 5.5; //51.C.4
    final int daysWithinFirstPaidPublicPerformanceInWhichTenOutOfTwelveCanBeCalled = 7; //51.C.6.a
    final int numberOfTenOutOfTwelvesPossibleInSevenDaysPriorToOpening = 2; //51.C.6.a
    final int numberOfTenOutOfTwelvesPerWeek = 2; //51.C.6.b
    final int repNumberOfDaysSinceLastTenOutOfTwelve = 20; //51.C.6.a
    final int numberOfRehearsalHoursPerWeekAfterOpeningOrOneWeekAfterOpeningOfActorFinalProductionInSeason = 10; //51.C.6.d
    final int numberOfWeeksAllowedForPlaywrightTouchUpsAfterOpening = 4; //51.C.6.d
    final int normalHoursOfWorkToGiveOneAndAHalfHoursOfBreak = 5; //51.C.6.f
    final double normalHoursOfBreakAfterFiveAndAHalfHoursOfWork = 1.5; //51.C.6.f
    final int minimumHoursOfBreakAfterFiveAndAHalfHoursOfWork = 1; //51.C.6.f
    boolean reduceFiveAndAHalfHourBreak; //51.C.6.f
    boolean payedLessThanACategoryMinimum; //51.C.6.g
    final int maxHoursRehearsalNonLocalTourPayedLessCastMember = 10; //51.C.6.g
    final int maxFreeCostumeCallsPriorToStartOfRehearsal = 1; //51.D.1.a
    final int maxCallPlusTravelHoursWithoutOverTimePayForACostumeCallPriorToStartOfRehearsal = 2; //51.D.1.a
    final int maxCallPlusTravelHoursPaidOvertimeForACostumeCallPriorToStartOfRehearsal = 4; //51.D.1.a
    final int paymentForOverFourHoursOfCostumeCallPriorToRehearsal = 1/6;
    final int maxCostumeOnlyCallHoursPerProduction = 7;
    final double minCostumeCallHours = .5;
    final int maxCostumeCallHoursWithoutBreak = 6;
    final int maxPictureCallsPerWeek = 1;
    final double minHoursForPictureCall = .5;
    final int minHoursNoticeForPictureCall = 24;
    final int maxHoursForCombinedRehearsalAndPhotoCall = 6;
    final int photoCallCutoffTime = 1;
    final int nameNotRequiredOnPhotoIfAtLeastPersons = 5;
    final int daysToCorrectPictureCreditError = 5;
    final int minHoursRehearsalTimeForNoBreakWithHalfHourDirectlyAfter = 1;
    final double minHoursAfterPerformanceForRehearsal = 1.5;
    final int maxHoursAfterPerformanceForRehearsal = 3;
    boolean reducedRehearsalAfterPerformanceRestPeriod;
    int reducedRehearsalAfterPerformanceRestPeriodToHours;
    final int minNormalRestHoursExceptStudent = 12;
    final int minRestHoursWithStudentOrWithReduction = 10;
    boolean restPeriodReduced;
    final int minReducedRestPeriodIfTwoPerformanceDay = 11;
    final double minHoursRestPeriodAfterPerformanceBeforePerformance = 1.5;
    final int minHoursRestPeriodIncludingHalfHourBetweenPerformancesOnTheSameDay = 1;
    final int minPerformanceHoursLocalTourForOneHalfHourBreak = 1;
    final double minRestPeriodTimeLocalTourBetweenPerformances = .5;
    String dayOff;
    final int minHoursDayOff = 24;
    final int maxDayOffChangesWithinTwentyFourWeeksOfTheStartOfTheSeason = 3;
    final int maxDayOffChangesWithinBalanceOfTheSeason = 3;
    final int maxNumberOfPerformancesInAThreeDayPeriodHoliday = 6;
    int numberOfExtraDaysOffChristmasWeek;
    int numberOfExtraDaysOffThanksgivingWeek;
    boolean dayLightRest;  //TODO check dayLightRest;
    final int earliestTimeToEndDaylightRestHoliday = 17;
    final int daysWithinOpeningToNotHaveDaylightRest = 7;
    final int maxWeeksToHaveDaylightRestWithin = 6;
    final int latestWeeksToAssignDaylightRestDay = 3;
    final int earliestTimeToEndDaylightRest = 18;
    final int minWeeksToChangeDaylightRestDay = 1;
    final int minWeeksForActorMultiProductionOneContractToHaveDaylightRest = 6;
    final int minPreviewPerformancesToHoldNotesAfter = 4;
    final int maxHoursForNotes = 1;

}
