'use strict';

angular.module('spacedOut').controller('deletePassController', ['$scope', 'monthlyPassFactory', 
	function($scope, monthlyPassFactory){
		
	$scope.deleteMonthlyPass = function() {
		monthlyPassFactory.deleteMonthlyPass($scope.data).then(
				function(success) {
					$scope.result = success;
					
				}, function(error) {
					$scope.result = error;
				});
		};
	
}]);