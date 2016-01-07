'use strict';

angular.module('spacedOut').controller('deletePassController', ['$scope', 'monthlyPassFactory', 
	function($scope, monthlyPassFactory){
		
	$scope.deleteMonthlyPass = function(passId) {
		
		monthlyPassFactory.deleteMonthlyPass(passId).then(
				function(success) {
					$scope.result = success;
					
				}, function(error) {
					$scope.result = error;
				});
		};
	
}]);