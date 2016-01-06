'use strict';

angular.module('spacedOut').controller('addPassController', ['$scope', 'monthlyPassFactory', 
	function($scope, monthlyPassFactory){
		
		$scope.monthlyPass = {};
		$scope.monthlyPass.passPrice = '';
	
	

	$scope.createMonthlyPass = function() {
		$scope.data = JSON.stringify($scope.monthlyPass);
		monthlyPassFactory.addMonthlyPass($scope.data).then(
				function(success) {
					$scope.result = success;
					
				}, function(error) {
					$scope.result = error;
				});
		};
	
}]);