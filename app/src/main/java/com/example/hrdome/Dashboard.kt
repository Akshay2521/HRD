package com.example.hrdome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.hrdome.databinding.ActivityDashboardBinding
import com.google.android.material.navigation.NavigationView


class Dashboard : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    private lateinit var binding: ActivityDashboardBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_dashboard)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController

        drawerLayout = findViewById(R.id.drawerLayout)
        val navView: NavigationView = findViewById(R.id.navView)

        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.module_org,
                R.id.module_user_admin,
                R.id.module_employees,
                R.id.module_leaves,
                R.id.module_timesheet,
                R.id.module_expense,
                R.id.module_performance_appraisal,
            ), drawerLayout
        )

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        binding.bottomNav.setupWithNavController(navController)

        // Handle navigation item clicks
        navView.setNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                //organization
                R.id.organization_profile -> {
                    navController.navigate(R.id.organizationProfileFragment)
                    true
                }

                R.id.location -> {
                    navController.navigate(R.id.locationFragment)
                    true
                }

                R.id.holidayCalendar -> {
                    navController.navigate(R.id.holidayCalendarFragment)
                    true
                }

                R.id.leaveType -> {
                    navController.navigate(R.id.leaveTypeFragment)
                    true
                }

                R.id.emailTemplate -> {
                    navController.navigate(R.id.emailTemplateFragment)
                    true
                }

                R.id.clients -> {
                    navController.navigate(R.id.clientsFragment)
                    true
                }

                R.id.projects -> {
                    navController.navigate(R.id.projectsFragment)
                    true
                }

                R.id.expenseCategory -> {
                    navController.navigate(R.id.expenseCategoryFragment)
                    true
                }

                //users

                R.id.roles -> {
                    navController.navigate(R.id.rolesFragment)
                    true
                }

                R.id.users -> {
                    navController.navigate(R.id.usersFragment)
                    true
                }

                //Employees

                R.id.employees -> {
                    navController.navigate(R.id.employeesFragment)
                    true
                }

                R.id.leaveBalance -> {
                    navController.navigate(R.id.leaveBalanceFragment)
                    true
                }

                //leaves

                R.id.submitLeave -> {
                    navController.navigate(R.id.submitLeaveFragment)
                    true
                }

                R.id.authorizeLeave -> {
                    navController.navigate(R.id.authorizeLeaveFragment)
                    true
                }

                R.id.reviewLeave -> {
                    navController.navigate(R.id.reviewLeaveFragment)
                    true
                }
//
//                //timesheet
//
//                R.id.submitTimesheet -> {
//                    navController.navigate(R.id.locationFragment)
//                    true
//                }
//
//                R.id.authorizeTimesheet -> {
//                    navController.navigate(R.id.locationFragment)
//                    true
//                }
//
//                R.id.reviewTimesheet -> {
//                    navController.navigate(R.id.locationFragment)
//                    true
//                }
//
//                //Expenses
//
//                R.id.submitExpense -> {
//                    navController.navigate(R.id.locationFragment)
//                    true
//                }
//
//                R.id.authorizeExpense -> {
//                    navController.navigate(R.id.locationFragment)
//                    true
//                }
//
//                R.id.reimburseExpense -> {
//                    navController.navigate(R.id.locationFragment)
//                    true
//                }
//
//                //performance Appraisal
//
//                R.id.submitPerformanceAppraisal -> {
//                    navController.navigate(R.id.locationFragment)
//                    true
//                }
//
//                R.id.reviewPerformanceAppraisal -> {
//                    navController.navigate(R.id.locationFragment)
//                    true
//                }

                else -> false
            }
        }

        binding.btnDrawer.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean =
        item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)


    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}