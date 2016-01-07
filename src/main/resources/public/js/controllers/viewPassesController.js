'use strict';

angular.module('spacedOut').controller('viewPassesController', ['$scope', 'monthlyPassFactory', 'customerFactory', 
function($scope, monthlyPassFactory, customerFactory){
	
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
	
	


	
	$scope.getCustomerList = function(){
		customerFactory.getCustomers().then(
			
			function(success) {
				$scope.customerList = success.data;
				console.log($scope.customerList);
			},
			function(error) {
				$scope.customerList = error.data;
			});
	};
	$scope.getCustomerList();
	
	
}])