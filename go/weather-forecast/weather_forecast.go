// Package weather will return the forcast for the given location.
package weather


// CurrentCondition passed by user.
var CurrentCondition string

// CurrentLocation passed by user.
var CurrentLocation string

// Forecast will accept city and condition and return the forcast.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
