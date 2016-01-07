'use strict';
angular.module('spacedOut')
.config(['$stateProvider', '$urlRouterProvider', 
  function($stateProvider, $urlRouterProvider){

	$urlRouterProvider.otherwise('/');

	$stateProvider.state('viewPasses', {
		url: '/viewPasses', 
		templateUrl: 'templates/viewPasses.tpl.html',
		controller: 'viewPassesController'
	}) 
     .state('addPass', {
    	url: '/addPass',
    	templateUrl: 'templates/addPass.tpl.html',
    	controller: 'addPassController'
    })
	.state('editPass', { 
        url: '/editPass',
        templateUrl: 'templates/editPass.tpl.html',
        controller: 'editPassController'
    })
    .state('deletePass', {
    	url: '/deletePass',
    	templateUrl: 'templates/deletePass.tpl.html',
    	controller: 'deletePassController'
    })
    .state('addCustomer', {
    	url: '/addCustomer',
    	templateUrl: 'templates/addPass.tpl.html',
    	controller: 'addCustomerController'
    })
    .state('viewCustomers', {
    	url: '/viewCustomers',
    	templateUrl: 'templates/viewPasses.tpl.html',
    	controller: 'viewCustomersController'
    });
}]);