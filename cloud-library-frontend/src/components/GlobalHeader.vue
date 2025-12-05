<!--
  GlobalHeader.vue
  ---------------------------------------------
  Purpose:
  This component renders the global header (top navigation bar)
  used across the entire Cloud Library frontend application.

  Main Features:
  - Displays the project logo and title (Cloud Library)
  - Provides a horizontal navigation menu with route-based highlighting
  - Supports clicking menu items to trigger router navigation
  - Contains a Login button for unauthenticated users
  - Includes external link to personal website
-->

<template>
  <div id="global-header">
    <a-row :wrap="false">
      <!-- Logo + Title area -->
      <a-col flex="200px">
        <router-link to="/">
          <div class="title-bar">
            <img class="logo" src="../assets/logo.png" />
            <div class="title">Cloud Library</div>
          </div>
        </router-link>
      </a-col>

      <!-- Navigation menu -->
      <a-col flex="auto">
        <a-menu
          v-model:selectedKeys="current"
          mode="horizontal"
          :items="items"
          @click="doMenuClick"
        />
      </a-col>

      <!-- User login button -->
      <a-col>
        <div class="user-login-status">
          <a-button type="primary" href="/user/login">Login</a-button>
        </div>
      </a-col>
    </a-row>
  </div>
</template>

<script lang="ts" setup>
import { h, ref } from 'vue';
import { HomeOutlined } from '@ant-design/icons-vue';
import { MenuProps } from 'ant-design-vue';
import { useRouter } from 'vue-router';

const router = useRouter();

// Menu configuration
// Each item corresponds to a route or an external link
const items = ref<MenuProps['items']>([
  {
    key: '/',
    icon: () => h(HomeOutlined),
    label: 'Home',
    title: 'Home',
  },
  {
    key: '/about',
    label: 'About',
    title: 'About',
  },
  {
    key: 'others',
    label: h(
      'a',
      { href: 'https://www.ZilinXu.com', target: '_blank' },
      'Personal Website'
    ),
    title: 'Personal Website',
  },
]);

// The currently selected menu item for highlighting
const current = ref<string[]>([]);

// Sync selected menu item with route changes
router.afterEach((to, from, next) => {
  current.value = [to.path];
});

// Handle menu click -> navigate to target route
const doMenuClick = ({ key }) => {
  router.push({
    path: key,
  });
};
</script>

<style scoped>
/* Header layout */
#global-header .title-bar {
  display: flex;
  align-items: center;
}

/* Project title styles */
.title {
  color: black;
  font-size: 18px;
  margin-left: 16px;
}

/* Logo size */
.logo {
  height: 48px;
}
</style>

