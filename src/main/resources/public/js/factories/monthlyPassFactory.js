angular.module('spacedOut').factory('monthlyPassFactory', ['$http', function($http) {
	return {
		getMonthlyPasses : function() {
			return $http.get('/monthlyPass');
		},
		getMonthlyPassById : function(passId){
			return $http.get('/monthlyPass/' + passId);
		},
		addMonthlyPass : function(monthlyPass) {
			return $http.post('/monthlyPass', monthlyPass);
		},
		deleteMonthlyPass : function(monthlyPass) {
			return $http.delete('/monthlyPass/' + passId);
		}
	}
}]);