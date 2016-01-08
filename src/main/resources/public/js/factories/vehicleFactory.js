angular.module('spacedOut').factory('vehicleFactory', ['$http', function($http) {
	return {
		getVehicles : function() {
			return $http.get('/vehicle');
		},
		getVehicleById : function(vehicleId){
			return $http.get('/vehicle/' + vehicleId);
		},
		addVehicle : function(vehicle) {
			return $http.post('/vehicle', vehicle);
		}
	}
}])