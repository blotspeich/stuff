'use strict';

angular.module('spacedOut').controller('viewPassesController', ['$scope', 'monthlyPassFactory', 
function($scope, monthlyPassFactory){
	
	$scope.getPassList = function(){
		monthlyPassFactory.getMonthlyPasses().then(
			
			function(success) {
				$scope.passList = success.data;
				console.log($scope.passList);
			},
			function(error) {
				$scope.passList = error.data;
			});
	};
	$scope.getPassList();
	
	
}])