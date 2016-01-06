angular.module('spacedOut').factory('monthlyPassFactory', ['$http', function($http) {
	return {
		getMonthlyPasses : function() {
			return $http.get('/monthlyPass');
		},
		getMonthlyPassById : function(passId){
			return $http.get('/monthlyPass/' + passId);
		}
	}
}])