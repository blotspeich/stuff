'use strict';

angular.module('spacedOut').controller('editPassController', ['$scope', 'toastr', 'customerFactory', 'monthlyPassFactory', 'vehicleFactory', 
                                                              function($scope, toastr, customerFactory, monthlyPassFactory, vehicleFactory){
	$scope.getMonthlyPassList = function(){
		monthlyPassFactory.getMonthlyPasses().then(
			function(success){
				$scope.monthlyPassList = success.data;
				console.log($scope.monthlyPassList)
			},
			function(error) {
				$scope.monthlyPassList = error.data;
			}
			
		)};
		$scope.getMonthlyPassList();
	$scope.monthlyPasses = {}
	$scope.monthlyPass = {};
	$scope.monthlyPass.passPrice = '';
	$scope.monthlyPass.customer = {};
	$scope.monthlyPass.customer.customerId = '';
	$scope.monthlyPass.vehicle = {};
	$scope.monthlyPass.vehicle.vehicleId = '';
	$scope.monthlyPass.expirationDate = '';
	
	$scope.editMonthlyPass = function(){
		$scope.data = JSON.stringify($scope.monthlyPass);
		monthlyPassFactory.editMonthlyPass($scope.data).then(
				function(success) {
					$scope.result = success;
					toastr.success('Monthly Pass Edited')
				}, function(error){
					$scope.result = error;
					toastr.error('Invalid entry');
				})
	};
	
}])