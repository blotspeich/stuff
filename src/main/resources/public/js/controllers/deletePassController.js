'use strict';

angular.module('spacedOut').controller('deletePassController', ['$scope', 'toastr', 'monthlyPassFactory', 
	function($scope, toastr, monthlyPassFactory){
		
	$scope.deleteMonthlyPass = function(passId) {
		
		monthlyPassFactory.deleteMonthlyPass(passId).then(
				function(success) {
					$scope.result = success;
					toastr.success('Monthly Pass Deleted')
					
				}, function(error) {
					$scope.result = error;
					toastr.error('Invalid entry');
				});
		};
	
}]);